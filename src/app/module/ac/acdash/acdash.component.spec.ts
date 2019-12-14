import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AcdashComponent } from './acdash.component';

describe('AcdashComponent', () => {
  let component: AcdashComponent;
  let fixture: ComponentFixture<AcdashComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AcdashComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AcdashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
