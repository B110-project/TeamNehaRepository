import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AhdashComponent } from './ahdash.component';

describe('AhdashComponent', () => {
  let component: AhdashComponent;
  let fixture: ComponentFixture<AhdashComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AhdashComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AhdashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
